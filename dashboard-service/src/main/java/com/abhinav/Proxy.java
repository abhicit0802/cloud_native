package com.abhinav;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@FeignClient(name = "searchservice")
@RibbonClient(name = "searchservice")
public interface Proxy {
    @RequestMapping("/employee/find/{id}")
    public EmployeeInfo findById(@PathVariable(value = "id") Long id);

    @RequestMapping("/employee/findall")
    public Collection<EmployeeInfo> findAll();
}
