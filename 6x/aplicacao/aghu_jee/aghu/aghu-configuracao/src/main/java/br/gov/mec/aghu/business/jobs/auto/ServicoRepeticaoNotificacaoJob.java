package br.gov.mec.aghu.business.jobs.auto;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobExecutionContext;

import br.gov.mec.aghu.aghparametros.business.IParametroFacade;
import br.gov.mec.aghu.aghparametros.util.AghuParametrosEnum;
import br.gov.mec.aghu.business.ISchedulerFacade;
import br.gov.mec.aghu.business.jobs.AghuJob;
import br.gov.mec.aghu.model.AghJobDetail;
import br.gov.mec.aghu.model.AghParametros;
import br.gov.mec.aghu.patrimonio.business.IPatrimonioFacade;
import br.gov.mec.aghu.core.exception.ApplicationBusinessException;
import br.gov.mec.aghu.core.locator.ServiceLocator;
import br.gov.mec.aghu.core.utils.DateUtil;

public class ServicoRepeticaoNotificacaoJob extends AghuJob {
	
	private static final Log LOG = LogFactory.getLog(ServicoRepeticaoNotificacaoJob.class);

	private IPatrimonioFacade patrimonioFacade = ServiceLocator.getBean(IPatrimonioFacade.class, "aghu-patrimonio");
	private ISchedulerFacade schedulerFacade = ServiceLocator.getBean(ISchedulerFacade.class, "aghu-configuracao");
	private IParametroFacade parametroFacade = ServiceLocator.getBean(IParametroFacade.class, "aghu-configuracao");
	
	@Override
	protected void doExecutarProcessoNegocio(AghJobDetail job, JobExecutionContext jobExecutionContext) throws ApplicationBusinessException {

		LOG.info("Envio de notificação de pendência de ticket.");

		try {
			AghParametros parametro = this.parametroFacade.buscarAghParametro(AghuParametrosEnum.P_AGHU_FREQUENCIA_ENVIO_PENDENCIA);

			if (parametro != null && StringUtils.isNotBlank(parametro.getVlrTexto())) {
				String[] arrayHoras = parametro.getVlrTexto().split(",");
				
				for (int i = 0; i < arrayHoras.length; i++) {
					if (StringUtils.isNotBlank(arrayHoras[i]) && StringUtils.isNumeric(arrayHoras[i])) {
						if (DateUtil.getHoras(new Date()).equals(Integer.valueOf(arrayHoras[i]))) {
							patrimonioFacade.enviarPendenciaEmailTicket(job);
							break;
						}
					}
				}
				
			}
		} catch (ApplicationBusinessException e) {
			LOG.error(e.getMessage());
			schedulerFacade.adicionarLog(job, e.getMessage());
		}
	}
}
