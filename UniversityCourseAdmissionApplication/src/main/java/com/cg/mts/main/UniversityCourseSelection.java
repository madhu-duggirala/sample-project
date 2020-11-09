package com.cg.mts.main;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.mts.entities.Admission;
import com.cg.mts.entities.AdmissionCommiteeMember;
import com.cg.mts.entities.AdmissionStatus;
import com.cg.mts.entities.Applicant;
import com.cg.mts.entities.Course;
import com.cg.mts.entities.UniversityStaffMember;
import com.cg.mts.repositoryImpl.CourseRepositoryImpl;
import com.cg.mts.serviceImpl.AdmissionCommitteeMemberServiceImpl;
import com.cg.mts.serviceImpl.ApplicantServiceImpl;

public class UniversityCourseSelection {
	
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
	EntityManager em=emf.createEntityManager();
	EntityTransaction eTransaction=em.getTransaction();
	AdmissionCommitteeMemberServiceImpl a = new AdmissionCommitteeMemberServiceImpl();
	AdmissionCommiteeMember aCommiteeMember = new AdmissionCommiteeMember();
	Admission admission = new Admission();
	admission.setAdmissionDate(LocalDate.of(1998, 10, 15));
	admission.setAdmissionId(124);
	admission.setApplicantId(222);
	admission.setCourseId(1222);
	AdmissionStatus admissionStatus = AdmissionStatus.Applied;
	Applicant applicant = new Applicant("26", "Hello", "256845", "B.tech", 56, admission, admissionStatus);
	ApplicantServiceImpl am= new ApplicantServiceImpl();
	am.addApplicant(applicant);
}
}