package com.projexacademy.elearnbackend;
import com.projexacademy.elearnbackend.models.*;
import com.projexacademy.elearnbackend.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Date;

@SpringBootApplication
public class ELearnBackEndApplication implements CommandLineRunner   {


    public static void main(String[] args) {
        SpringApplication.run(ELearnBackEndApplication.class, args);
    }

    @Autowired
    private FormateurRepository formateurRepository;
    @Autowired
    private ApprenantRepository apprenantRepository;
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
   private FormationRepository formationRepository;
    @Autowired
    NotificationRepository notificationRepository;
    @Autowired
    CatRepository catRepository;

    @Override
    public void run(String... args) throws Exception {
        Formateur formateur=new Formateur("nom","prenom","email","tel",new Date(),
                "pass","ncin","pseudo","spec","grade");
        this.formateurRepository.save(formateur);

        Notification notification= new Notification("title","desc",UserType.FORMATEUR.value);

        formateur.getNotifications().add(notification);
        notification.setUser(formateur);
        this.notificationRepository.save(notification);
        Formation formation=new Formation("titre","desc",new Date(),11);

        formation.getFormateurs().add(formateur);
        Cat cat=new Cat("title","desc");
        this.catRepository.save(    cat);
        cat.getFormations().add(formation);

        formation.getCatalogues().add(cat);

        formateur.getFormations().add(formation);

        this.formationRepository.save(formation);
        this.catRepository.saveAndFlush(    cat);
        this.formateurRepository.saveAndFlush(formateur);
        Apprenant apprenant=new Apprenant("nom","prenom","email","tel",new Date(),
                "pass","ncin","pseudo");
        this.apprenantRepository.save(apprenant);
        Admin admin=new Admin("nom","prenom","email","tel",new Date(),
                "pass","ncin","pseudo");
        this.adminRepository.save(admin);


        }
}
