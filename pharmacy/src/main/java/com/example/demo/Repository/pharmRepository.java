package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


import com.example.demo.Model.pharmModel;

public interface pharmRepository extends JpaRepository<pharmModel,Integer>{
	@Modifying
	@Query(value="select * from pharm_model ",nativeQuery=true)
	public List<pharmModel> GetAll();
    @Modifying
	@Query("delete from pharmModel i where i.medicinename=?1")
	public int DeleteHotelmenuBydish(String dish);
    @Modifying

	@Query("update pharmModel e set e.medicinename=?1 where e.medicineno=?2")

	public int UpdateHotelmenuByNo(String dish,int menuno);

}
