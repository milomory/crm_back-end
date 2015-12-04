package net.bonvio.mvc.entityController;

import net.bonvio.model.*;
import net.bonvio.mvc.generic.GenericController;
import net.bonvio.service.entityInterface.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mil on 26.11.15.
 */

@Controller
@RequestMapping("/company")
public class CompanyController extends GenericController<Company> {

    /**
     * Autowired
     */
    @Autowired
    CompanyService companyService;

    @RequestMapping(value = "email/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Email> getEmails(@PathVariable Integer id) {
        return companyService.getEmailListByCompanyId(id);
    }

    @RequestMapping(value = "phone/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Phone> getPhones(@PathVariable Integer id) {
        return companyService.getPhoneListByCompanyId(id);
    }

    @RequestMapping(value = "social/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Social> getSocial(@PathVariable Integer id) {
        return companyService.getSocialListByCompanyId(id);
    }

    @RequestMapping(value = "tag/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Tag> getTags(@PathVariable Integer id) {
        return companyService.getTagListByCompanyId(id);
    }

    @RequestMapping(value = "website/{id}", method = RequestMethod.GET)
    @ResponseBody
    public List<Website> getWebSite(@PathVariable Integer id) {
        return companyService.getWebsiteListByCompanyId(id);
    }

}
