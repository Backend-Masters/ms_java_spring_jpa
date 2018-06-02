package com.cppc.backend.sample.repository;

import com.cppc.backend.sample.domain.GiftProvider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GiftProviderRepository extends JpaRepository<GiftProvider, Integer> {}
