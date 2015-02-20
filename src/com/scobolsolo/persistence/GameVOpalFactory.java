package com.scobolsolo.persistence;
import com.scobolsolo.application.GameV;

public interface GameVOpalFactory extends com.opal.OpalFactory<GameV, GameVOpal> {
	/* This Opal has neither references (foreign keys) nor single lookups (unique keys), so this class has 
	   no actual content.
	*/
}
