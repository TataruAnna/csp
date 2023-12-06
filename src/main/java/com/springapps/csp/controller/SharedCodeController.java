package com.springapps.csp.controller;

import com.springapps.csp.dto.SharedCodeRequestDTO;
import com.springapps.csp.model.SharedCode;
import com.springapps.csp.service.SharedCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SharedCodeController {

    private SharedCodeService sharedCodeService;

    @Autowired
    public SharedCodeController(SharedCodeService sharedCodeService) {
        this.sharedCodeService = sharedCodeService;
    }

    @PostMapping
    public ResponseEntity<SharedCode> addSharedCode(@RequestBody SharedCodeRequestDTO sharedCodeRequestDTO){
        return ResponseEntity.ok(sharedCodeService.addSharedCode(sharedCodeRequestDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SharedCode> addSharedCode(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(sharedCodeService.getSharedCode(id));
    }
}
