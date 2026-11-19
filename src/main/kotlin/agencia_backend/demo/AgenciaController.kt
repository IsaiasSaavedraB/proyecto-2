package agencia_backend.demo
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/agencia")
class AgenciaController(private val repository: AgenciaRepository) {
    @GetMapping
    fun obtenerTareas(): List<Agencia> {
        return repository.findAll()
    }
    @PostMapping
    fun guardarTarea(@RequestBody nuevaTarea: Agencia): Agencia{
        return repository.save(nuevaTarea)
    }
}