package com.davis.page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PageService {

	private PageRepository pageRepositroy;
	
	@Autowired
	public PageService(PageRepository pageRepository) {
		this.pageRepositroy = pageRepository;
	}
}
