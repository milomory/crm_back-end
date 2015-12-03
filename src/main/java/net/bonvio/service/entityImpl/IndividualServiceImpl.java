package net.bonvio.service.entityImpl;

import net.bonvio.model.Individual;
import net.bonvio.service.GenericServiceImpl;
import net.bonvio.service.entity.IndividualService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class IndividualServiceImpl extends GenericServiceImpl<Individual> implements IndividualService {

}
