package org.archreactor.makerspacemvc.models.data;

import org.archreactor.makerspacemvc.models.forms.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface MemberDao extends CrudRepository<Member, Integer>{
}
