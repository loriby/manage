package com.github.digital.security.admin.rest;

import com.github.digital.security.common.rest.BaseController;
import com.github.digital.security.admin.biz.GwTestTBiz;
import com.github.digital.security.admin.entity.GwTestT;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("gwTestT")
public class GwTestTController extends BaseController<GwTestTBiz,GwTestT> {

}