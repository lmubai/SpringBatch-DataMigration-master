package com.ksource.batch.quartz.scheduler;

import com.ksource.batch.job.UserBatchTestJob;
import com.ksource.batch.quartz.ApplicationContextUtil;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author itmrchen
 * @date 2016/10/12
 * @time 13:19
 */
@DisallowConcurrentExecution
public class UserSchedulerJob extends QuartzJobBean {
    private static final Logger logger = LoggerFactory.getLogger(UserSchedulerJob.class);
    private String batchJob;

    public void setBatchJob(String batchJob) {
        this.batchJob = batchJob;
    }

    @Override
    protected void executeInternal(JobExecutionContext context) {
        logger.info("定时计划任务开始");
        ApplicationContext applicationContext = ApplicationContextUtil.getApplicationContext();
        UserBatchTestJob job = applicationContext.getBean(batchJob, UserBatchTestJob.class);
        logger.info("定时计划任务开始 : " + job);
        try {
            job.performJob();
        } catch (Exception exception) {
            logger.error("任务: " + batchJob + " 不能被执行 : " + exception.getMessage());
        }
        logger.info("定时计划任务执行结束");
    }
}