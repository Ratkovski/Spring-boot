package com.loteria.apirest.resources;
import com.loteria.apirest.models.loteria;
import com.loteria.apirest.repository.LoteriaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

//esta classe irá receber as requisições HTTP
@RestController
@RequestMapping(value = "/api") //define uma URI padrão
@Api(value = "/API REST numeros loteria")// descrição para o swagger
@CrossOrigin(origins = "*") //libera todos os dominios da aplicação ou seja o * permite que qualquer dominio pode acessar esta api
public class LoteriaResources {
    @Autowired //ponto de injeção
    LoteriaRepository loteriaRepository;



    //listar todos os dados salvos
    @GetMapping("/numeros")
    @ApiOperation( value = "Retorna os todos dados do banco")// descrição para o swagger
    public List<loteria> listaNumeros(){
        return loteriaRepository.findAll();
    }

    //listar um dado especifico
    @GetMapping("/numero/{id}")
    @ApiOperation( value = "Retorna dados do banco referente a um determinado id")// descrição para o swagger
    public loteria listaNumeroId(@PathVariable(value = "id")long id){ //@PathVariable(value = "id") determina que vai ser passado um argumento no caso o id
        return loteriaRepository.findById(id);
    }


    //salvar os dados
    @NotBlank// os campos não podem estar vazios
    @PostMapping("/numero")
    @ApiOperation( value = "Salva os dados do banco")// descrição para o swagger
    public loteria salvaNumero(@RequestBody loteria numeros){
        return loteriaRepository.save(numeros);

    }
    //deletar dados
    @DeleteMapping("/numero")
    @ApiOperation( value = "Deleta os dados do banco")// descrição para o swagger
    public void deletaNumero(@RequestBody loteria numero){
        loteriaRepository.delete(numero);

    }
    //alterar dados
        @PutMapping("/numero")
        @ApiOperation( value = "Atualiza os dados do banco")// descrição para o swagger
    public loteria atualizaNumero(@RequestBody loteria numero){
        return loteriaRepository.save(numero);

    }

}










