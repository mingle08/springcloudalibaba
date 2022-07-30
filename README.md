1 版本说明
  github查看spring cloud alibaba项目的wiki中的版本说明

2 Nacos
  查看版本说明之后，选择2.0.3版本，但是mac m1无法运行nacos 2.0.3
  <https://github.com/alibaba/nacos/issues/5289#>
  <https://github.com/alibaba/nacos/issues/4336>

3 复制模块order和stock，名称改为order-nacos和stock-nacos，也就是多一个nacos版本

4 运行nacos
  ```shell
  sh startup.sh -m standalone
  ```
