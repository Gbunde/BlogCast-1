package repositories;

import models.Timeline;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TimelineRepository extends CrudRepository<Timeline, Long> {
    List<Timeline> findTimelineBy(String blogEntry);

}
