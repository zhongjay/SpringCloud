
feign是默认关闭hystrix的，需要手动开启：
    1.如果是yml文件，请在文件中加入：
    
            feign:
              hystrix:
                enabled: true
        
    2.如果是properties文件，请在文件中加入：
    
        feign.hystrix.enabled=true