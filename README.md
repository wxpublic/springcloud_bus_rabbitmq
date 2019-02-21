# springcloud_config
springcloud分布式配置中心Config Bus(RabbitMQ) Demo

# 分布式配置中心项目模型：

1、git远端存储持久配置文件；

2、springcloud config server 从git上拉取文件缓存在本地服务器；

3、微服务项目（作为config client端）使用配置文件的时候，从本地configServer上拉取。

4、利用springcloudBus消息中间件rabbitMQ的通知发布订阅原理 进行全局刷新配置。

# 配置文件如何实时刷新！
配置文件在git上的更改默认无法刷新config client配置，如何做到更改git上的配置文件并更新到所有微服务：

自动刷新模式效果 --- 消息总线进行实时通知，所有微服务监听消息总线服务，有一个服务配置更新，则其他所有服务自动更新。项目跑起来之后，以post方式利用此地址刷新接口： http://ip:port/actuator/bus-refresh 即可


本项目中的分布式演示springcloud自带的分布式配置中心Config 的功能；配置文件存在gitee仓库cloud_itmayi_config中的busconfig文件夹中;
仓库地址:https://gitee.com/wx_public/cloud_itmayi_config.git


