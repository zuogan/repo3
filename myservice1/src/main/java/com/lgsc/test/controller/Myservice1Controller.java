package com.lgsc.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 服务注释111
 * @作者 admin
 * @时间 2017-05-27
 */
@Api(tags = "myservice1", description = "服务注释111")
@RestController
@RequestMapping("testurl1")
public class Myservice1Controller {

		/**
		* 方法注释2
		* @作者 admin
		* @时间 2017-05-27
		*
		* @param param1 参数注释 
		* @return
		*/
		@ApiOperation(value = "testMethod2")
		@RequestMapping(value = "methodUrl2", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
		public String testMethod2(@ApiParam(value = "参数注释", required = true) @RequestParam("param1") String param1) {
			return "";
		}
		
		/**
		* 方法注释1
		* @作者 admin
		* @时间 2017-05-27
		*
		* @param param1 参数注释1 
		* @return
		*/
		@ApiOperation(value = "testMethod1")
		@RequestMapping(value = "methodUrl1", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
		public String testMethod1(@ApiParam(value = "参数注释1", required = true) @RequestParam("param1") String param1) {
			return "";
		}
		
		/**
		* 方法注释3
		* @作者 admin
		* @时间 2017-05-27
		*
		* @param param1 参数注释 
		* @return
		*/
		@ApiOperation(value = "testMethod3")
		@RequestMapping(value = "methodUrl3", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
		public String testMethod3(@ApiParam(value = "参数注释", required = true) @RequestParam("param1") String param1) {
			return "";
		}
		
}