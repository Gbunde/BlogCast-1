package repositories;

import models.Timeline;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimelineRepository extends CrudRepository<Timeline, Long> {

}
