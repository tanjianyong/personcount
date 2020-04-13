/**
 * 
 */
package com.personanalyse.controller;


import com.personanalyse.service.analyse.PersonAnalyseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


/**
* @author phil(jianytan@amd.com)
* @version create-date：Apr 28, 2019 4:59:12 PM
* @Descprtion change from long-url to short-url and resume long-url 
*/
@RestController
@CrossOrigin (origins = "*", maxAge = 3600)
@Api(value = "/analyse")
public class ShortenUrlController {

	@Autowired
	PersonAnalyseService personAnalyseService;
	
	@GetMapping ("/analyse")
	@ApiOperation(value = "Get-person number", notes = " get person number")
    public JSONObject AddShortenUrl() throws Exception {
  		return personAnalyseService.getDynamicPersonNumber();
    }
}
