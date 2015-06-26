<?php

use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateTugasTable extends Migration {

	/**
	 * Run the migrations.
	 *
	 * @return void
	 */
	public function up()
	{
		Schema::create('tugas', function(Blueprint $table)
		{
			$table->increments('id');
			$table->string('aktivitas');
			$table->string('deskripsi');
			$table->date('tgl_deadline');
			$table->enum('status', ['0', '1'])->default('1');
			$table->timestamps();
		});
	}

	/**
	 * Reverse the migrations.
	 *
	 * @return void
	 */
	public function down()
	{
		Schema::drop('tugas');
	}

}
