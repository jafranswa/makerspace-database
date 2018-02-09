package org.archreactor.makerspacemvc.models.data;

import org.archreactor.makerspacemvc.models.forms.Reader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ReaderDao extends CrudRepository<Reader, Integer>{
}
