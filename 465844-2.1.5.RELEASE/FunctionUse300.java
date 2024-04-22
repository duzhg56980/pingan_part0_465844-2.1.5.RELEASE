import org.springframework.cloud.openfeign.ribbon.LoadBalancerFeignClient;
public class FunctionUse300 {
public void funcUse() {
LoadBalancerFeignClient loadbalancerfeignclient = new LoadBalancerFeignClient();
loadbalancerfeignclient.execute(null,null);
}
}