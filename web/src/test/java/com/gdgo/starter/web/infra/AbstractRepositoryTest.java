package com.gdgo.starter.web.infra;

import javax.transaction.Transactional;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@Transactional
@ActiveProfiles("test")
@SpringBootTest
public abstract class AbstractRepositoryTest {
}
