package com.hook.xcs60.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hook.xcs60.dao.ArrestLawbreakerAddressRepository;
import com.hook.xcs60.dao.ArrestLawbreakerRepository;
import com.hook.xcs60.dto.arrest.law.breaker.OpsArrestLawbreakergetByConRequest;
import com.hook.xcs60.dto.arrest.staff.ArrestStaffgetByConRequest;
import com.hook.xcs60.model.OpsArrestLawbreaker;
import com.hook.xcs60.model.OpsArrestLawbreakerAddress;
import com.hook.xcs60.model.OpsArrestStaff;
import com.hook.xcs60.utils.ResponseBuilder;


@RestController
public class ArrestLawbreakerController {
	
	@Autowired
	ArrestLawbreakerRepository arrestLawbreakerRepository;
	
	@Autowired
	ArrestLawbreakerAddressRepository arrestLawbreakerAddressRepository;
	
	@RequestMapping("/ArrestLawbreakergetByCon")
	public Object ArrestLawbreakergetByCon(@RequestBody OpsArrestLawbreakergetByConRequest request) {
		try {
			Optional<OpsArrestLawbreaker> lawbreaker = arrestLawbreakerRepository.findByLawbreakerID(request.getLawbreakerID());
			
			if(lawbreaker.isPresent()) 
			{
				OpsArrestLawbreaker oLawbreaker = lawbreaker.get();
				System.out.print("golfxx:" + oLawbreaker.getLawbreakerRefID());
				List<OpsArrestLawbreakerAddress> addressList = arrestLawbreakerAddressRepository.findByLawbreakerID(new BigDecimal(oLawbreaker.getLawbreakerRefID()));
				if(addressList != null && addressList.size() > 0)
				{
					oLawbreaker.setArrestLawBreakerAddressList(addressList);
				}
			}
			
			return ResponseBuilder.Success(lawbreaker);
		}catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
	
	@RequestMapping("/ArrestLawbreakerinsAll")
	public Object ArrestLawbreakerinsAll(@RequestBody OpsArrestLawbreaker request) {
		 try {
			 request.setIsActive((short)1);
			 OpsArrestLawbreaker arrestLawbreaker = arrestLawbreakerRepository.save(request);
			 
			 List<OpsArrestLawbreakerAddress> addressList = arrestLawbreaker.getArrestLawBreakerAddressList();
			 if(addressList != null && addressList.size() > 0)
			 {
				 for(int i = 0; i < addressList.size(); i++) {
					 //addressList.get(i).setLawbreakerID(arrestLawbreaker.getLawbreakerID());
					 //System.out.println("child: " + arrestLawbreaker.getLawbreakerID());
//					 System.out.println("child: " + addressList.get(i).getLawbreakerID());
					 addressList.get(i).setIsActive((short)1);
					 arrestLawbreakerAddressRepository.save(addressList.get(i));
				 }
			 }
			 return ResponseBuilder.Success();
		 }
		 catch (Exception e) 
		 {
			 return ResponseBuilder.Error(e.getMessage());
		 }
	}
	
	@RequestMapping("/ArrestLawbreakerupdByCon")
	public Object ArrestLawbreakerupdByCon(@RequestBody OpsArrestLawbreaker request) {
		try {
			if(request != null && request.getLawbreakerID() != null) 
			{
				System.out.println("golf: " + request.getLawbreakerID());
				Optional<OpsArrestLawbreaker> lawbreaker = arrestLawbreakerRepository.findByLawbreakerID(request.getLawbreakerID());
				System.out.println("golf: " + lawbreaker.get());
				System.out.print("gff" + lawbreaker.get().getIsActive());
				if(lawbreaker.isPresent())
				{
					
					request.setIsActive(lawbreaker.get().getIsActive());
					arrestLawbreakerRepository.save(request);
					
					if(request.getArrestLawBreakerAddressList() != null && request.getArrestLawBreakerAddressList().size() > 0) 
					{
						List<OpsArrestLawbreakerAddress> addressList = request.getArrestLawBreakerAddressList();
						
						for(int i = 0; i < addressList.size(); i++)
						{
							Optional<OpsArrestLawbreakerAddress> oAddress = arrestLawbreakerAddressRepository.findByLawbreakerAddressID(addressList.get(i).getLawbreakerAddressID());

							if(oAddress.isPresent())
							{
								addressList.get(0).setIsActive(oAddress.get().getIsActive());
								arrestLawbreakerAddressRepository.save(addressList.get(0));
							}
						}
					}
					
					return ResponseBuilder.Success();
				}
				
			}
			
			return ResponseBuilder.Error("");
		}
		catch (Exception e) 
		{
			return ResponseBuilder.Error(e.getMessage());
		}
		
	}
	@RequestMapping("/ArrestLawbreakerupdDelete")
	public Object ArrestLawbreakerupdDelete(@RequestBody OpsArrestLawbreakergetByConRequest request) {
		try {
			if(request != null && request.getLawbreakerID() != null) 
			{
				Optional<OpsArrestLawbreaker> lawbreaker = arrestLawbreakerRepository.findByLawbreakerID(request.getLawbreakerID());
				
				if(lawbreaker.isPresent())
				{
					OpsArrestLawbreaker oLawbreaker = lawbreaker.get();
					oLawbreaker.setIsActive((short) 0);
					arrestLawbreakerRepository.save(oLawbreaker);
					
					List<OpsArrestLawbreakerAddress> addressList = arrestLawbreakerAddressRepository.findByLawbreakerID(new BigDecimal(oLawbreaker.getLawbreakerRefID()));
					
					if(addressList != null && addressList.size() > 0)
					{
						for (int i = 0; i < addressList.size(); i++)
						{
							addressList.get(i).setIsActive((short) 0);
							arrestLawbreakerAddressRepository.save(addressList.get(i));
						}
					}
	
					
					return ResponseBuilder.Success();
				}
			}
				
			return ResponseBuilder.Error("");
		}catch (Exception e) {
			return ResponseBuilder.Error(e.getMessage());
		}
	}
}
