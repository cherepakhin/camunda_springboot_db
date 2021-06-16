package ru.perm.v.camunda.demo.access.repository;

import ru.perm.v.camunda.demo.access.domain.AccessRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccessRequestRepository extends JpaRepository<AccessRequest, Long> {
    Optional<AccessRequest> findOneByEntityId(Long entityId);

}
