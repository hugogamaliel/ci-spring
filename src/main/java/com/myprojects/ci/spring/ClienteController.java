package com.myprojects.ci.spring;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class ClienteController 
{
    @GetMapping("/greeting")
    public String greeting(){
        LOGGER.info("line 1");
        LOGGER.info("row2");
        return "hello";
    }
    
    @GetMapping("/saludo")
	public String saludo(){
		return "saludo";
	}
}
