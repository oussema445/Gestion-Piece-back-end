package com.oussema.pieces.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.*;
=======
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

>>>>>>> 70c64d6888c0438f5d1298cb6ff87affd423c920
import com.oussema.pieces.entities.Pieces;
import com.oussema.pieces.service.PieceService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PieceRESTController {

	@Autowired
	PieceService pieceService ;
	
	@RequestMapping(path="all",method = RequestMethod.GET)
	List<Pieces> getAllPieces(){
		return pieceService.getAllPieces();
	}
	
	
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	public Pieces getPieceById(@PathVariable("id") Long id) {
	return pieceService.getPiece(id);
	}
	
<<<<<<< HEAD
	@RequestMapping(value="/addpiec",method = RequestMethod.POST)
	@PreAuthorize("hasAuthority('ADMIN')")
=======
	@RequestMapping(value="/addpiec", method = RequestMethod.POST)
	@PreAuthorize("hasAnyAuthority('ADMIN')")
>>>>>>> 70c64d6888c0438f5d1298cb6ff87affd423c920
	public Pieces createPiece(@RequestBody Pieces pieces) {
	return pieceService.savePiece(pieces);
	}
	
	@RequestMapping(value="/updatepiec",method = RequestMethod.PUT)
	public Pieces updatePiece(@RequestBody Pieces pieces) {
	return pieceService.savePiece(pieces);
	}
	
	@RequestMapping(value="/delpiec/{id}",method = RequestMethod.DELETE)
	public void deletePiece(@PathVariable("id") Long id)
	{
	pieceService.deletePieceById(id);
	}
	
	@RequestMapping(value="/piecsnat/{idNat}",method = RequestMethod.GET)
	public List<Pieces> getPiecesBy_NatId(@PathVariable("idNat") Long idNat) {
	return pieceService.findByNatureIdNat(idNat);
	}
	
	@RequestMapping(value="/piecsByName/{nom}",method = RequestMethod.GET)
	public List<Pieces> findByNomPieceContains(@PathVariable("nom") String nom) {
	return pieceService.findByNomPieceContains(nom);
	}
	
}
	