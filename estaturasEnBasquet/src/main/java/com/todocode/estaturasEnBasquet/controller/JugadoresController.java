
package com.todocode.estaturasEnBasquet.controller;

import com.todocode.estaturasEnBasquet.model.Jugador;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JugadoresController {
    
    
    @PostMapping ("/jugadores")
    public String calcularPromedioEstatura (@RequestBody List<Jugador> listaJugadores) {
    
        double suma_estaturas=0.0;
        double promedio_estatura=0.0;
        
       // creamos lista para guardar jugadores
        List<Jugador> listaJuga = new ArrayList<Jugador>();
        listaJuga = listaJugadores;
        
        // clase - itera- nombre list
        for (Jugador jug : listaJuga) {
            suma_estaturas = suma_estaturas + jug.getEstatura();
        }
        
        promedio_estatura = suma_estaturas / (listaJuga.size());
        
        // Response con el promedio de altura de los jugadores
        return "Jugadores registrados correctamente. El promedio de estatura de los mismos es: " + promedio_estatura;
    }
    
    
    
}

