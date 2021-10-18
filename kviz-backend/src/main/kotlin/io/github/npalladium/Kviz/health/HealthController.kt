package io.github.npalladium.Kviz.health

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController {
    @GetMapping("/health")
    fun checkHealth(): HealthStatus {
        return HealthStatus("Up")
    }
}

class HealthStatus(status: String) {
    val status = status;
}