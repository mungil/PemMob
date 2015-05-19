<?php namespace App;

use Illuminate\Database\Eloquent\Model;

class Tugas extends Model 
{
	protected $fillable = ['aktivitas', 'deskripsi', 'tgl_deadline', 'status'];
}