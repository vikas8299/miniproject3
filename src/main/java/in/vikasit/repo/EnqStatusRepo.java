package in.vikasit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vikasit.entity.EnqStatusEntity;

public interface EnqStatusRepo extends JpaRepository<EnqStatusEntity, Integer> {

}
