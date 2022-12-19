package service;

import com.source.exception.SizeIsFullExceptionInitiated;
import com.source.service.CheckTheDataOnceAgainItsNotMatchingRequriements;

import dto.BakeryDTO;

public interface BakeryService {


		boolean validateAndSave(BakeryDTO dto) throws CheckTheDataOnceAgainItsNotMatchingRequriements, SizeIsFullExceptionInitiated;
	}

