package com.davis.page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("page")
public class PageController {

	private PageService pageService;
	
	@Autowired PageController(PageService pageService) {
		this.pageService = pageService;
	}
	
}
