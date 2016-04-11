package com.variamos.dynsup.model;

import java.util.List;

import com.variamos.dynsup.interfaces.IntOpersPairwiseRel;
import com.variamos.dynsup.interfaces.IntOpersRelType;

/**
 * A class to represent the edges with semantic back object. Part of PhD work at
 * University of Paris 1
 * 
 * @author Juan C. Mu�oz Fern�ndez <jcmunoz@gmail.com>
 * 
 * @version 1.1
 * @since 2014-11-23
 * @see com.cfm.productline.
 */
public class OpersPairwiseRel extends OpersElement implements
		IntOpersPairwiseRel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7976788205587295216L;
	/**
	 * 
	 */
	private List<IntOpersRelType> semanticRelationTypes;

	public OpersPairwiseRel() {
		super(null);
	}

	public OpersPairwiseRel(String identifier, boolean toSoftSemanticConcept,
			List<IntOpersRelType> semanticRelationTypes) {
		super(identifier);
		this.semanticRelationTypes = semanticRelationTypes;
	}

	public List<IntOpersRelType> getSemanticRelationTypes() {
		return semanticRelationTypes;
	}
}