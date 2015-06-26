<?php namespace App\Http\Controllers;

use App\Tugas;
use App\Http\Controllers\Controller;
use Illuminate\Http\Request;

class TugasController extends Controller
{
	public function index() {
		$tugas = Tugas::all();
		
		//return to JSON
		return response()->json($tugas);
	}

	//untuk mengambil 1 data saja
	public function getTugas($id) {
		$tugas = Tugas::find($id);
		return response()->json($tugas);
	}

	//untuk menyimpan data
	public function saveTugas(Request $request) {
		$tugas = Tugas::create($request->all());

		return response()->json($tugas);
	}

	//untuk menghapus data
	public function deleteTugas($id) {
		$tugas = Tugas::find($id);

		$tugas->delete();

		return response()->json('success');
	}

	public function updateTugas(Request $request, $id) {
		$tugas = Tugas::find($id);

		$tugas->aktivitas		= $request->input('aktivitas');
		$tugas->deskripsi 		= $request->input('desk');
		$tugas->tgl_deadline 	= $request->input('deadline');
		$tugas->status 			= $request->input('status');

		$tugas->save();

		return response()->json($tugas);
	}
}

// from : http://www.codetutorial.io/lumen-first-tutorial/