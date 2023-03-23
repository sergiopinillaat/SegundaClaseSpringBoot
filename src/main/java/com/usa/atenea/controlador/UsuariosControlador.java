package com.usa.atenea.controlador;

import com.usa.atenea.dtos.UsuariosDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class UsuariosControlador {

    @GetMapping("/usuarios")
    //Logica para realizar el get
    public String obtenerUsuarios(){
        return "Hola mundo";
    }

    @PostMapping("/usuarios")
    public ResponseEntity<UsuariosDto> crearUsuarios(@RequestBody UsuariosDto usuariosDto){
        return ResponseEntity.status(201).body(usuariosDto);
    }

    @DeleteMapping("/usuarios")
    public void eliminarUsuarios(@RequestParam int id){
        System.out.println(id);
    }

    @PutMapping("/usuarios")
    public void actualizarUsuarios(@RequestBody UsuariosDto usuariosDto){
        System.out.println(usuariosDto.toString());
    }

}
