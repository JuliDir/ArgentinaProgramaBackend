
package com.ap.ap.services;

import com.ap.ap.exception.NotFoundException;
import com.ap.ap.models.Skills;
import com.ap.ap.repository.SkillsRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillsService {
    private final SkillsRepo skillsRepo; 
    
    @Autowired
    public SkillsService(SkillsRepo skillsRepo){
        this.skillsRepo = skillsRepo; 
    }
    
    public Skills addSkill(Skills skills){
        return skillsRepo.save(skills); 
    }
    
    public List<Skills> buscarSkills(){
        return skillsRepo.findAll(); 
    }
    
    public Skills editarSkill(Skills skills){
        return skillsRepo.save(skills); 
    }
    
    public void borrarSkill(Long id){
        skillsRepo.deleteById(id);
    }

    public Skills buscarSkillsPorId(Long id) {
        return skillsRepo.findById(id).orElseThrow(() -> new NotFoundException("Skill no encontrada"));
    }
}
