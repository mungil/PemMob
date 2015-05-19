<?php

use Illuminate\Database\Seeder;
use Illuminate\Database\Eloquent\Model;
use App\Tugas;

class TugasSeeder extends Seeder
{
	public function run() {
		
		$new = array(
			[
				'id'	 		=> '',
				'aktivitas' 	=> 'belajar lumen',
				'deskripsi'		=> 'membuat aplikasi yg bermanfaat menggunakan lumen',
				'tgl_deadline'	=> '2015-05-20',
				'status'		=> '1',
				'created_at' 	=> new DateTime,
				'updated_at' 	=> new DateTime
			],
			[
				'id'	 		=> '',
				'aktivitas' 	=> 'belajar REST',
				'deskripsi'		=> 'REST(Representational State Transfer)',
				'tgl_deadline'	=> '2015-05-20',
				'status'		=> '1',
				'created_at' 	=> new DateTime,
				'updated_at' 	=> new DateTime
			]
		);

		DB::table('tugas')->insert($new);
	}
}