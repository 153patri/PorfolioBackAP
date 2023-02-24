
package com.porfolio.integrador.Service;

import com.porfolio.integrador.Entity.Experiencia;
import com.porfolio.integrador.Repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
     @Autowired
     RExperiencia rExperiencia;
     
     public List<Experiencia> list(){
         return rExperiencia.findAll(); //arma una lista de todas las experiencias que encuentre. 
     }
     
     public Optional<Experiencia> getOne(int id){
         return rExperiencia.findById(id); //busca por id 
     }
     
     public Optional<Experiencia> getByNombreE(String nombreE){
         return rExperiencia.findByNombreE(nombreE); //busca experiencia por nombre
     }
     
     public void save(Experiencia expe){
         rExperiencia.save(expe); //guarda tipo de dato experiencia
     }
     
     public void delete(int id){
         rExperiencia.deleteById(id); //void es porque no devuelve nada, solo borra por id 
     }
     
     public boolean existsById(int id){ 
         return rExperiencia.existsById(id); //me dice si existe o no por id 
     }
     
     public boolean existsByNombreE(String nombreE){
         return rExperiencia.existsByNombreE(nombreE);
     }
}
