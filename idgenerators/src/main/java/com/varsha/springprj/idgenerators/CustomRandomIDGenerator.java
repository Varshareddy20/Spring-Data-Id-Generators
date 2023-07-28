package com.varsha.springprj.idgenerators;

import java.util.Random;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomRandomIDGenerator implements IdentifierGenerator {

	@Override
	public Object generate(SharedSessionContractImplementor session, Object obj) {

		Random random = null;
		int id=0;
		random = new Random();
		id = random.nextInt(10000000);
		
		return new Long(id);
	}

}
