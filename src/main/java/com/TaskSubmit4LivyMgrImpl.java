package com;

import org.quartz.JobExecutionContext;

import java.util.logging.Logger;

/**
 * 向yarn 上提交Spark 任务
 */
public class TaskSubmit4LivyMgrImpl{

//   private static Logger log = Logger.getLogger(TaskSubmit4LivyMgrImpl.class);
    //通过Livy 提交spark 任务到yarn 集群
//    public void invoke(JobExecutionContext context) {
////        log.info("~~ invoke task");
//        String url = "http://172.17.11.11:8998/batches";
//        String postData = "{\"kind\": \"spark\"}";
//        String pData = "{\"file\":\"D://Pi.jar\",\"className\":\"neu.edu.cn.PiJob\" }";
//        String reqResult = ReqEngine.sendPostReq(url, pData);
//        System.out.println(reqResult);
//    }
    public static void main(String[] args){

        String url = "http://172.17.11.170:8998/batches";

        String postData = "{\"kind\": \"spark\"}";
        String pData = "{\"file\":\"hdfs://172.17.11.170:9000/jar/spark-examples-1.6.3-hadoop2.6.0.jar\",\"className\":\"org.apache.spark.examples.SparkPi\"}";
        String reqResult = ReqEngine.sendPostReq(url, pData);
//        String reqResult = ReqEngine.sendPostReq(url,postData);
        System.out.println(reqResult);
    }
}
