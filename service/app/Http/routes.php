<?php

/*
|--------------------------------------------------------------------------
| Application Routes
|--------------------------------------------------------------------------
|
| Here is where you can register all of the routes for an application.
| It's a breeze. Simply tell Laravel the URIs it should respond to
| and give it the controller to call when that URI is requested.
|
*/

$app->get('/', function() use ($app) {
    return $app->welcome();
});

$app->get('api/tugas', 'App\Http\Controllers\TugasController@index');

$app->get('api/tugas/{id}', 'App\Http\Controllers\TugasController@getTugas');

$app->post('api/tugas', 'App\Http\Controllers\TugasController@saveTugas');

$app->put('api/tugas/{id}', 'App\Http\Controllers\TugasController@updateTugas');

$app->delete('api/tugas/{id}', 'App\Http\Controllers\TugasController@deleteTugas');
