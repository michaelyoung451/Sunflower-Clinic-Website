package com.sunflowerclinicmassage.website.data;

import com.sunflowerclinicmassage.website.models.Prospect;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProspectRepository extends CrudRepository<Prospect, Integer> {
}
