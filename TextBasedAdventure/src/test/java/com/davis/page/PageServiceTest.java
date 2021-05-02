package com.davis.page;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.davis.TextBasedAdventureApplication;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = TextBasedAdventureApplication.class)
public class PageServiceTest {
	
	@Autowired
	private PageService pageService;

	@MockBean
	private PageRepository pageRepository;
	
}
