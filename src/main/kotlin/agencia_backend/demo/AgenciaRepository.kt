package agencia_backend.demo
import org.springframework.data.jpa.repository.JpaRepository

interface AgenciaRepository : JpaRepository<Agencia, Long>{
}