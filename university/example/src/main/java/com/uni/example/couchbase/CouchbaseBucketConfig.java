package com.uni.example.couchbase;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseDataConfiguration;
import org.springframework.data.couchbase.config.CouchbaseConfigurer;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@Configuration
@EnableCouchbaseRepositories
public class CouchbaseBucketConfig extends AbstractCouchbaseDataConfiguration {
	
	@Autowired
	private CouchbaseEnvironmentConfiguerer environmentConfigurer;

	@Override
	protected CouchbaseConfigurer couchbaseConfigurer() {
		return environmentConfigurer;
	}
}
