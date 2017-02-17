package edu.uic.cs.cs442.repository;

import edu.uic.cs.cs442.model.CrimeRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * Created by thomasdutta on 2/17/17.
 */

@Transactional
public interface CrimeRepository extends CrudRepository<CrimeRecord, String> {
}
