package com.example.demo.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Model.HotelmenuModel;

public interface HotelmenuRepository extends JpaRepository<HotelmenuModel,Integer > {
	
	@Modifying
	@Query(value="select * from hotelmenu_model ",nativeQuery=true)
	public List<HotelmenuModel> GetAll();
    @Modifying
	@Query("delete from HotelmenuModel i where i.dish=?1")
	public int DeleteHotelmenuBydish(String dish);
    @Modifying

	@Query("update HotelmenuModel e set e.dish=?1 where e.menuno=?2")

	public int UpdateHotelmenuByNo(String dish,int menuno);

}

