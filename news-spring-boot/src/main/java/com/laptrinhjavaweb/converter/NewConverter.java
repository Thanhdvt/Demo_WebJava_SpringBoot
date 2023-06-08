package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.entity.NewEntity;

@Component
public class NewConverter {
	
	//Cập nhật Entity mới
	public NewEntity toEntity(NewDTO dto) {
		NewEntity entity = new NewEntity();
	    entity.setTitle(dto.getTitle());
	    entity.setContent(dto.getContent());
	    entity.setShortDescription(dto.getShortDescription());
	    entity.setThumbnail(dto.getThumbnail());
		return entity;
	}
	
	public NewDTO toDTO(NewEntity entity) {
		NewDTO dto = new NewDTO();
		if(entity.getId() != null) {
			dto.setId(entity.getId());
		}
	    dto.setTitle(entity.getTitle());
	    dto.setContent(entity.getContent());
	    dto.setShortDescription(entity.getShortDescription());
	    dto.setThumbnail(entity.getThumbnail());
	    dto.setCreateDate(entity.getCreateDate());
	    dto.setCreateBy(entity.getCreateBy());
	    dto.setModifiedDate(entity.getModifiedDate());
	    dto.setModifiedBy(entity.getModifiedBy());
		return dto;
	}

	//Cập nhật Entity đã có
	public NewEntity toEntity(NewDTO dto, NewEntity entity) {
	    entity.setTitle(dto.getTitle());
	    entity.setContent(dto.getContent());
	    entity.setShortDescription(dto.getShortDescription());
	    entity.setThumbnail(dto.getThumbnail());
		return entity;
	}
}
