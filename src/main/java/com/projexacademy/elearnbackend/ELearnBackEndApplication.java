package com.projexacademy.elearnbackend;
import com.projexacademy.elearnbackend.models.Admin;
import com.projexacademy.elearnbackend.models.Apprenant;
import com.projexacademy.elearnbackend.models.Formateur;
import com.projexacademy.elearnbackend.repositories.AdminRepository;
import com.projexacademy.elearnbackend.repositories.ApprenantRepository;
import com.projexacademy.elearnbackend.repositories.FormateurRepository;
import com.projexacademy.elearnbackend.repositories.FormationRepository;
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

    @Override
    public void run(String... args) throws Exception {
        this.formateurRepository.save(new Formateur("nom","prenom","email","tel",new Date(),"pass","ncin","pseudo","spec","grade"));
        this.apprenantRepository.save(new Apprenant("nom","prenom","email","tel",new Date(),"pass","ncin","pseudo"));
        this.adminRepository.save(new Admin("nom","prenom","email","tel",new Date(),"pass","ncin","pseudo"));
     //  this.formationRepository.save(new Formation("titre"));
        }
}
